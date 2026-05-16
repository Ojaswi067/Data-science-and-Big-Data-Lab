object Hello
{
	def main(args : Array[String]):Unit={
		println("hello, this is a simple scala program")
		//for loop
		for(i <- 1 to 5){
			println("i^2=",i*i)
		}
	}
}
