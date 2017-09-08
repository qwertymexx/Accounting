import java.util.Date

object AccountingEvents {

  case class Payout(amount: Int, debit: String, credit: String, date: Date)

  case class Due(amount: Int, debit: String, credit: String, date: Date)

  abstract class Repayment

  case class RatePayment(amount: Int, debit: String, credit: String, date: Date) extends Repayment

  case class FullEarlyRepayment(amount: Int, debit: String, credit: String, date: Date) extends Repayment

  case class PartialEarlyRepayment(amount: Int, debit: String, credit: String, date: Date) extends Repayment

}


