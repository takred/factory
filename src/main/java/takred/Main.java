package takred;

public class Main {
    public static void main(String[] args) {
        CrucibleOfEnchantment crucibleOfEnchantment = new CrucibleOfEnchantment();
        Weapon myWeapon = new Axe();
        EnchantOptions myEnchant = EnchantOptions.LIGHTNING;
        EnchantedWeapon myEnchantWeapon = crucibleOfEnchantment.enchantment(myWeapon, myEnchant.name());
        System.out.println(myEnchantWeapon.enchantWeapon());

    }
}
