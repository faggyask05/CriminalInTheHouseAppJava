package criminalInTheHouse;

import criminalInTheHouse.GameMenu.menuOption;

public class CriminalInTheHouseGame {

	public static void main(String[] args) {

		GameMenu menu = new GameMenu();
		String menuValues = " ";

		if (menuValues != null) {

			try {
				menuValues = menu.showMenu();
				menuOption mo = menuOption.valueOf(menuValues);
				menu.setMyOption(mo);
				menu.menu(menu.getMyOption());
			} catch (WrongValueException wve) {
				wve.errorMessage();
			}

		}

	}
}