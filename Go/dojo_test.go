// para instalar o goconvey:
// $ go get -t github.com/smartystreets/goconvey

// para rodar os testes (interface web)
// linux: $ $GOPATH/bin/goconvey
// windows: > %GOPATH%/bin/goconvey
// abrir http://localhost:8080/

// para rodar os testes (terminal)
// $ go test -v

// respeitar o padrão *_test.go

package dojo

import (
	"fmt"
	"testing"
	. "github.com/smartystreets/goconvey/convey"
)

func TestIntegerManipulation(t *testing.T) {
	var x int

	Convey("Given a starting integer value", t, func() {
		x = 42

		Convey("When incremented", func() {
			x++

			Convey("The value should be greater by one", func() {
				So(x, ShouldEqual, 43)
			})
			Convey("The value should NOT be what it used to be", func() {
				So(x, ShouldNotEqual, 42)
			})
		})
		Convey("When decremented", func() {
			x--

			Convey("The value should be lesser by one", func() {
				So(x, ShouldEqual, 41)
			})
			Convey("The value should NOT be what it used to be", func() {
				So(x, ShouldNotEqual, 42)
			})
		})
		Reset(func() {
			x = 0
		})
	})
}

func main() {
	fmt.Printf("Hello, world.\n")
}