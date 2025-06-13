//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        SuperHero sh = new SuperHero();
        Weapon w = new Weapon();
        sh.fly();
        sh.run();
        sh.test();
        Hero h = new Hero();
        h.run();
        h.test();
    }
}