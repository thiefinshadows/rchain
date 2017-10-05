package rholang.parsing.rholang1.Absyn; // Java Package generated by the BNF Converter.

public class VPtStruct extends ValPattern {
  public final String var_;
  public final ListPattern listpattern_;
  public VPtStruct(String p1, ListPattern p2) { var_ = p1; listpattern_ = p2; }

  public <R,A> R accept(rholang.parsing.rholang1.Absyn.ValPattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang1.Absyn.VPtStruct) {
      rholang.parsing.rholang1.Absyn.VPtStruct x = (rholang.parsing.rholang1.Absyn.VPtStruct)o;
      return this.var_.equals(x.var_) && this.listpattern_.equals(x.listpattern_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.var_.hashCode())+this.listpattern_.hashCode();
  }


}