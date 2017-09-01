import java.text.SimpleDateFormat
import java.util.{Calendar}

object AccountingOutput {


  case class Journal_18xxxx(date: String, debit: Int, credit: Int, loanID: String)

  case class Journal_121020(date: String, debit: Int, credit: Int, loanID: String)

  case class Journal_400000(date: String, debit: Int, credit: Int, loanID: String)

  case class Journal_121021(date: String, debit: Int, credit: Int, loanID: String)


  def main(args: Array[String]): Unit = {
    val sdf = new SimpleDateFormat("yyyy-MM-dd")
    val c = Calendar.getInstance()
    val now = sdf.format(c.getTime)

    c.setTime(sdf.parse(now))
    c.add(Calendar.DATE, 31)  // number of days to add
    val dueDate = sdf.format(c.getTime())
    c.add(Calendar.DATE, 3)
    val repaymentDate = sdf.format(c.getTime)


    val id = "id"

    println("**-Journal_ID*-time_stamp***Db*Cr**ID")
    println("Payout event")
    println(Journal_18xxxx(date = now, debit = 0, credit = 100, loanID = id))
    println(Journal_121020(date = now, debit = 100, credit = 0, loanID = id))
    println("DUE event")
    println(Journal_400000(dueDate, 0, 20, id))
    println(Journal_121021(dueDate, 20, 0, id))
    println("Repayment Event")
    println(Journal_18xxxx(repaymentDate, 120, 0, id))
    println(Journal_121020(repaymentDate, 0, 100, id))
    println(Journal_121021(repaymentDate, 0, 20, id))


    val timeStamp = println(now)
  }
}
