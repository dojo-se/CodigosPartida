using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace CodigoPartidaCS
{
    class Dojo
    {
        public int resultado = 1;

        static void Main(string[] args)
        {
            
        }
    }

    [TestClass]
    public class DojoTests
    {
        [TestMethod]
        public void TestMethod1()
        {
            Dojo dojo = new Dojo();
            Assert.AreEqual(1, dojo.resultado);
        }
    }
}
