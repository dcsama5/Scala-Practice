::#!
@echo on
call scala %0 %*
echo this will display
goto :UPDATE

:UPDATE
echo "hi"
goto :eof
::!#

// Say hello to the first argument
  println("Hello, "+ args(0) +"!" + args(1))
