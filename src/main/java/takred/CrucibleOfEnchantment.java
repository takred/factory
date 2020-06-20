package takred;

public class CrucibleOfEnchantment {
    public EnchantedWeapon enchantment(Weapon weapon, String enchant) {
        if (enchant.equals("FIRE")) {
            return new FireWeapon(weapon);
        }
        if (enchant.equals("ICE")) {
            return new IceWeapon(weapon);
        }
        if (enchant.equals("LIGHTNING")) {
            return new LightningWeapon(weapon);
        }
        return null;
    }
}
