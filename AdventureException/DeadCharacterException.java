public class DeadCharacterException extends Exception {
    public DeadCharacterException(Character character) {
        super(getMessage(character));
    }

    public static String getMessage(Character character) {
        String type = "";

        if (character instanceof Sorcerer) {
            type = "sorcerer";
        } else if (character instanceof Monster) {
            type = "monster";
        } else if (character instanceof Templar) {
            type = "templar";
        } else {
            type = "character";
        }

        return "The " + type + " " + character.getName() + " is dead.";
    }
}
