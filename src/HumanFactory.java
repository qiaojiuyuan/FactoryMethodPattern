
public class HumanFactory extends AbstractHumanFactory{

	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (T) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("生产人种出错！");
		}
		return (T)human;
	}

}
