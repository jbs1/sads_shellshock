object Console {
	type NAME = String;

	sealed abstract class EXPR
	case class variable(name: NAME) extends EXPR
	case class string(str: String) extends EXPR

	sealed abstract class COMM()
	case class com_seq(coms: Array[COMM]) extends COMM
	case class fun_call()


	def main(args: Array[String]): Unit = {

	}
}
