package decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {
	//所有的调料装饰者都必须重新实现getDescription()。
	public abstract String getDescription();
}
