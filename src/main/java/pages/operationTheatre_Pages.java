package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class operationTheatre_Pages extends StartupPage {
	
//	Write the Locators here 

	
	String pageName = this.getClass().getSimpleName();
	public operationTheatre_Pages(WebDriver driver) {
		super(driver);
	}
	
	/**@Test1.1
	 * Logs into the Health App using the provided valid credentials.
	 *
	 * @param expectedData A map containing login credentials with keys "username" and "password".
	 * @return true if the login is successful and the registered patient text is displayed, false otherwise.
	 * @throws Exception if any issue occurs during login.
	 * 
	 * This method:
	 * - Finds and highlights the username and password text fields.
	 * - Enters the provided username and password.
	 * - Clicks the sign-in button.
	 * - Verifies if the registered patient text is displayed to confirm successful login.
	 * 
	 * @author Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		//Write your logic here
		return false;
	}

	/**@Test1.2
	 * Verifies the title of the current page.
	 * @param : null
	 * @return The title of the current page as a String.
	 * @throws Exception if any issue occurs while retrieving the title.
	 * 
	 * This method:
	 * - Retrieves the title of the currently loaded page.
	 * - Prints the title to the console.
	 * - Returns the title as a String.
	 * 
	 * @author YAKSHA
	 */
	public String verifyTitleOfThePage() throws Exception {
		//Write your logic here
				return null;
	}

	/**@Test1.3
	 * Retrieves and verifies the URL of the current page.
	 * @param : null
	 * @return The current page URL as a String.
	 * @throws Exception if any issue occurs while retrieving the URL.
	 * 
	 * This method:
	 * - Retrieves the URL of the currently loaded page.
	 * - Prints the URL to the console.
	 * - Returns the URL as a String.
	 * 
	 * @author YAKSHA
	 */
	public String verifyURLOfThePage() throws Exception {
		//Write your logic here
				return null;
	}

	/**@Test2
	 * Navigates to the Operation Theatre module and verifies the table header name.
	 * @param : null
	 * @return The table header name as a String if the Operation Theatre module is present; otherwise, an empty string.
	 * @throws Exception if any issue occurs during navigation or verification.
	 * 
	 * This method:
	 * - Checks if the Operation Theatre module is present.
	 * - Clicks on the module if it is available.
	 * - Verifies if the hospital number table header is displayed.
	 * - Retrieves and returns the table header name.
	 * 
	 * @author YAKSHA
	 */
	public String goToOperationTheatreModuleVerifyTableHeaderName() throws Exception {
		//Write your logic here
				return null;
	}

	/**@Test3
	 * Verifies the Booking OT Schedule form by clicking the "New OT Booking" button.
	 * @param : null
	 * @return The title name of the Booking OT Schedule form as a String.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Clicks on the "New OT Booking" button.
	 * - Retrieves and returns the title name of the Booking OT Schedule form.
	 * 
	 * @author YAKSHA
	 */
	public String verifyBookingOTScheduleFormByClickingOnNewOTBookingButton() throws Exception {
		//Write your logic here
				return null;
	}


	/**@Test4
	 * Verifies if the textboxes are present, enters values into them, and validates the entered values.
	 * @param expectedData A map containing values for:
	 *        - "patientName": The value to be entered in the patient selection textbox.
	 *        - "diagnosisValue": The value to be entered in the diagnosis textbox.
	 *        - "surgeryTypeValue": The value to be entered in the surgery type textbox.
	 * @return The value entered in the patient selection textbox as a String.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Checks if the Booking OT Schedule form title is displayed.
	 * - Enters values into the patient name, diagnosis, and surgery type textboxes.
	 * - Retrieves and returns the value entered in the patient selection textbox.
	 * 
	 * @author YAKSHA
	 */
	public String verifyEnteredDataIsPresentInSelectPatientTextbox(Map<String, String> expectedData) throws Exception {

		//Write your logic here
				return null;
	}
	
	/**@Test5
	 * Verifies the placeholder name of a textbox.
	 * @param : null
	 * @return The placeholder name of the textbox as a String.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Checks if the textbox is enabled.
	 * - Retrieves and returns the placeholder text of the textbox.
	 * 
	 * @author YAKSHA
	 */
	public String verifyPlaceholderNameOfTexboxIfTextboxIsEnabled() throws Exception {
		//Write your logic here
				return null;
	}

	
	/**@Test6
	 * Verifies if a button is present after entering a value into the surgeon name text field.
	 *
	 * @param expectedData A map containing:
	 *        - "surgenNameValue1": The value to be entered into the surgeon name text field.
	 * @return The text of the surgeon name button if present, otherwise an empty string.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Checks if the surgeon name text field is displayed.
	 * - Enters the provided surgeon name and presses Enter.
	 * - Clicks on the Any other text box to trigger UI changes.
	 * - Checks if the surgeon name button is displayed.
	 * - Retrieves and returns the text of the surgeon name button.
	 * 
	 * @author YAKSHA
	 */
	public String verifyButtonIsPresentAfterSendValueToSurgenNameTextfield(Map<String, String> expectedData) throws Exception {
		//Write your logic here
				return null;
	}

	 /**@Test7
	 * Verifies if the plus (+) button is present after clicking the external checkbox.
	 * @param : null
	 * @return true if the plus (+) button is displayed after selecting the checkbox, otherwise false.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Checks if the external checkbox is displayed.
	 * - Clicks the external checkbox.
	 * - Verifies if the checkbox is selected.
	 * - Checks if the plus (+) button is displayed.
	 * - Returns true if the plus (+) button is present.
	 * 
	 * @author YAKSHA
	 */
	public Boolean verifyPlusButtonIsPresentAfterClickOnExternalCheckbox() throws Exception {
		//Write your logic here
				return false;
	}
	
	/**@Test8
	 * Verifies the error message displayed in the "Add External Referral" form.
	 * @param : null
	 * @return The error message as a String if displayed; otherwise, an empty string.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Checks if the plus (+) icon button is displayed.
	 * - Clicks on the plus (+) icon button.
	 * - Clicks on the "Add" button in the "Add External Referral" form.
	 * - Checks if the error message is displayed.
	 * - Retrieves and returns the error message text.
	 *
	 * @author YAKSHA
	 */
	public String verifyErrorMessageInAddExternalReferralForms() throws Exception {
		//Write your logic here
				return null;
	}
	
	 /**
     * @Test9
     * Method: verifySuccessNotificationPopupMessage()
     * @param expectedData - A Map containing expected values for referrer details such as 
     *                      referrer name, address, contact number, and email.
     * @description - This method populates the external referral form fields, submits the form, 
     *               and retrieves the success notification message displayed on the UI.
     * @return - A String containing the success notification messages.
     * @throws Exception - Throws an exception if any error occurs during execution.
     * @author - YAKSHA
     */
	
	public String verifySuccessNotificationPopupMessage(Map<String, String> expectedData) throws Exception {
		//Write your logic here
				return null;
	}
	
	

}
