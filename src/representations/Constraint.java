package representations;

import java.util.*;

public interface Constraint {
    
    public Set<Variable> getScope();
    
    public boolean isSatisfiedBy(Map<Variable,String> allocation);
}