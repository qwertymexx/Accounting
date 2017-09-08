import java.util.Date

case class Account_transaction(date: Date, amount: Int, debit_account_id: Account, credit_account_id: Account)

abstract class Account

sealed case class Receivables_Principal(id: Int = 121020, name: String = "Installment Loan Receivables - Loan Principal") extends Account

sealed case class Receivables_Interest(id: Int = 121021, name: String = "Installment Loan Receivable - Interest & Fees") extends Account

sealed case class Liability_1cent(id: Int = 121400, name: String = "cent verification liability") extends Account

sealed case class Factoring_receivables(id: Int = 122100, name: String = "Receivables - Factoring") extends Account

sealed case class Bad_Loan_Principal(id: Int = 124020, name: String = "Installment Loan Receivables - Bad Loan Principal ") extends Account

sealed case class Bad_Loan_Interest(id: Int = 124021, name: String = "Installment Loan Receivables - Bad Loan Interest & Fees") extends Account

sealed case class GoodLoan_ProvisionLoss(id: Int = 124800, name: String = "Good Loan - expected loss provision") extends Account

sealed case class BadLoan_ProvisionLoss(id: Int = 124900, name: String = "Bad Loan - specific loss provision") extends Account

sealed case class VAT_receivable(id: Int = 140000, name: String = "VAT-Receivable from customer") extends Account

sealed case class Bancomer_Bank(id: Int = 180309, name: String = "Bancomer MX Bank") extends Account

sealed case class STP_Bank(id: Int = 180316, name: String = "STP MX Bank") extends Account

sealed case class Conekta_Bank(id: Int = 180317, name: String = "Conekta MX Bank") extends Account

//sealed case class Acc_1804 -PL
//sealed case class Acc_1806 -ES

sealed case class Liability_Overpayment(id: Int = 331023, name: String = "Liability - Overpayment (Installment Loan )") extends Account

sealed case class VAT_payable(id: Int = 380000, name: String = "VAT payable") extends Account

sealed case class Revenue(id: Int = 400000, name: String = "Revenue - Commission") extends Account

sealed case class Revenue_Overdue(id: Int = 402000, name: String = "Revenues - Overdue Fees") extends Account

sealed case class Revenue_Unerwriting(id: Int = 405000, name: String = "Revenues - Underwriting fees") extends Account

sealed case class Revenue_Interest(id: Int = 420000, name: String = "Revenue - Interest") extends Account