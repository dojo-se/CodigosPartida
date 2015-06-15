using Base.Test

function quad (a::Int, b::Int, c::Int)
  if a == 0
     error("The value of a should be non zero!")
  end

  discriminant(a, b, c) = sqrt(b*b - 4*a*c)

  res(a,b,c, delta) = (-b + delta*discriminant(a,b,c))/(2*a)

  return (res(a,b,c, -1),res(a, b, c, 1))
end

pt_test_handler(r::Test.Success) = println("$(r.expr) executado com successo!")
function pt_test_handler(r::Test.Failure)
  println("$(r.expr) executado com falhas!")
end
pt_test_handler(r::Test.Error) = rethrow(r)

Test.with_handler(pt_test_handler) do
  @test_throws ErrorException quad(0,2,3)
  @test quad(2, 5, -3) == (-3, 0.5)
  @test quad(1,-3,1) == (0.3819660112501051,2.618033988749895)
end