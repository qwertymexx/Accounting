
import java.util.Date

import PaymentType.PaymentType


object PaymentType extends Enumeration{
  type PaymentType = Value
  val IN, OUT = Value
}
case class Payment(tipe: PaymentType, channel: String, amount: Int, date: Date)

case class Installment(principal: Int, due: Date, fee: Int, vat: Int)

case class Loan(uuid:String, paidDate: Date, numberInst: Int, payment: List[Payment], installment: List[Installment])

case class DataModel (data: List[Loan]){

}
