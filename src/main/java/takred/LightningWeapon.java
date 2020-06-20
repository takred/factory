package takred;

public class LightningWeapon implements EnchantedWeapon{
    private final String type;

    public LightningWeapon(Weapon weapon) {
        this.type = weapon.getType();
    }

    @Override
    public String enchantWeapon() {
        return "Ваш " + type + " зачарован молнией!";
    }
}
