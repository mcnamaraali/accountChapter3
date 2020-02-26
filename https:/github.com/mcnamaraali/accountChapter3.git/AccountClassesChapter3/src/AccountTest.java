/**
 * @author alimcnamara
 *
 */
public class AccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Account account1 = new Account("Jane Green");
		Account account2 = new Account("John Blue");
		
		System.out.printf("Account1 is %s%n%n ", account1.getName());
		System.out.printf("Account2 is %s%n%n ", account2.getName());

	}

}
