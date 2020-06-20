package takred;

public class IceWeapon implements EnchantedWeapon {
    private final String type;

    public IceWeapon(Weapon weapon) {
        this.type = weapon.getType();
    }

    @Override
    public String enchantWeapon() {
        return "Ваш " + type + " зачарован льдом!";
    }
}
