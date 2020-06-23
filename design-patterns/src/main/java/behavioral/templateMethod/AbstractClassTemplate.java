package behavioral.templateMethod;

public abstract class AbstractClassTemplate {

    public void template() {
        concreteMethod();
        if (doGetFlag()) {
            abstractMethod1();
        }
        abstractMethod2();
    }

    /**
     * 基本方法一般用final修饰，防止子类修改，这个方法是所有继承这个模板的类共有的
     */
    public final void concreteMethod() {
        System.out.println("具体方法");
    }

    /**
     * 模板抽象方法，由子类具体实现
     */
    public abstract void abstractMethod1();

    /**
     * 模板抽象方法，由子类具体实现
     */
    public abstract void abstractMethod2();

    /**
     * 钩子方法
     * 一般do开头，如doGet() doPost()
     *
     * @return
     */
    protected boolean doGetFlag() {
        return true;
    }

}
