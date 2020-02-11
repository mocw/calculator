cd C:\Users\wojmo\IdeaProjects\calculator\src
javac -cp junit-4.13.jar .\main\java\pl\lodz\uni\math\Calculator.java .\test\java\pl\lodz\uni\math\CalculatorTest.java 
$output = java -cp junit-4.13.jar`;hamcrest-core-1.3.jar`;.\main\java\`;.\test\java org.junit.runner.JUnitCore pl.lodz.uni.math.CalculatorTest 
$lines  = $output -split "`n"
foreach($line in $lines){
$text = $text + $line + "`r`n"
}
Write-host $text
if($lines -like "*OK*"){
Write-Host OK
$status = "TEST PASSED"
} else {
Write-Host Errors!
$status = "TEST FAILED!"
}
$text = $text + $status
$time = (Get-Date).ToString("HH mm s")
$path = ".\scriptTests\app_[" + $time + "s.].txt"
$text | Out-File -LiteralPath $path
