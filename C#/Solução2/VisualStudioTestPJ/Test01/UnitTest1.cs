using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Test01
{

    class Dojo
    {
        public int resultado = 1;

        static void Main(string[] args)
        {

        }
    }

    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Dojo dojo = new Dojo();
            Assert.AreEqual(1, dojo.resultado);
        }

        [TestMethod]
        public void TestarErro()
        {
            Dojo dojo = new Dojo();
            Assert.AreEqual(0, dojo.resultado);
        }
    }
}
