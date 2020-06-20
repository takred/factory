package takred;

public class FireWeapon implements EnchantedWeapon{
    private final String type;

    public FireWeapon(Weapon weapon) {
        this.type = weapon.getType();
    }

    @Override
    public String enchantWeapon() {
        return "Ваш " + type + " зачарован огнём!";
    }
}
