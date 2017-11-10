package zoo;

public class Visitor {

  private Zoo visitingZoo;

  public Zoo getVisitingZoo() {
    return visitingZoo;
  }

  public void visitZoo(Zoo zoo) {
    this.visitingZoo = zoo;
    this.visitingZoo.addVisitor(this);
  }

  public void leaveZoo() {
    this.visitingZoo.removeVisitor(this);
    this.visitingZoo = null;
  }
}
