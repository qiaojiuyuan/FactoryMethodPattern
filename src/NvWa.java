
public class NvWa {

	public static void main(String[] args) {
		AbstractHumanFactory factory = new HumanFactory();
		System.out.println("--开始生产白种人--");
		Human whiteHuman = factory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("--开始产生黄色人种--");
		Human yellowHuman = factory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
		
		System.out.println("--开始生产黑色人种--");
		Human blackHuman = factory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
	}
}
