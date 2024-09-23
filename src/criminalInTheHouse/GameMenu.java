package criminalInTheHouse;

import java.util.Scanner;

public class GameMenu {

	enum menuOption {
		NEW_GAME, SAVE_GAME, LOAD_GAME, OPTION, EXIT;
	}

	private menuOption myOption = null;
	private Scanner scn;

	public menuOption getMyOption() {
		return myOption;
	}

	public void setMyOption(menuOption myOption) {
		this.myOption = myOption;
	}

	/**This method can be show the menu on the console and checks whether the entered value is correct, if not, it throws an WrongValueException, if it is, it checks that the value is within the specified parameters, if everything is fine, it sends the received data to the converter, otherwise it also throws a WrongValueException.
*/
	public String showMenu() throws WrongValueException {

		scn = new Scanner(System.in);
		int menuValues = 0;
		String menuValue = " ";
		System.out.println("MENU:" + "\n" + "1; New  Game                   || 2; Save Game " + "\n"
				+ "3; Load Game                   || 4; Option " + "\n" + "                     " + "5;Exit " + "\n"
				+ "Please Choose!");

		if (scn.hasNextInt()) {

			menuValues = scn.nextInt();

			if (menuValues > 0 && menuValues < 6) {
				menuValue = converter(menuValues);
			} else {
				throw new WrongValueException(menuValues);
			}

		} else {
			String i = scn.nextLine();
			throw new WrongValueException(i);
		}
		scn.close();
		return menuValue;

	}

	/** This method receives a number value between 1 and 5, depending on what the number is, this method converts it to the appropriate string. */
	private String converter(int menuValues) throws WrongValueException {
		String menuValue = " ";
		switch (menuValues) {
		case 1:
			menuValue = "NEW_GAME";
			break;
		case 2:
			menuValue = "SAVE_GAME";
			break;
		case 3:
			menuValue = "LOAD_GAME";
			break;
		case 4:
			menuValue = "OPTION";
			break;
		case 5:
			menuValue = "EXIT";
			break;

		default:

			break;
		}
		return menuValue;
	}

	/** This method get the enum parameter and check it to it is null, or not, if not null, than the he method send it this parameter, to the menu.*/
	public menuOption menu(menuOption menuOption) throws WrongValueException {
		menuOption myChoose = menuOption;
		if (myChoose != null)
			extracted(myChoose);
		return myChoose;
	}

	/**This is a menu options, this method  get the enum parameter, and runing, the correct case block.*/
	private menuOption extracted(menuOption myChoose) throws WrongValueException {
		switch (myChoose) {
		case NEW_GAME:
			System.out.println("new game");
			break;
		case SAVE_GAME:
			System.out.println("save game");
			break;
		case LOAD_GAME:
			System.out.println("Load game");
			break;
		case OPTION:
			System.out.println("option");
			break;
		case EXIT:
			System.out.println("Good Bye!");
			System.exit(0);

			break;

		default:
			break;
		}
		return myChoose;
	}

}
