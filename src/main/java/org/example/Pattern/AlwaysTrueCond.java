package org.example.Pattern;
import org.example.Util.ModelUtil;
import spoon.reflect.CtModel;
import spoon.reflect.code.CtIf;
import spoon.reflect.visitor.Filter;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.List;


public class AlwaysTrueCond extends AbstractPattern{
    String logMessage = "Always True Condition";
    CtModel model;

    public AlwaysTrueCond(ModelUtil model){
        this.model = model.getModel();
    }

    @Override
    public void process(){
        List<CtIf> ifs = model.getElements(new TypeFilter<>(CtIf.class));
        for(CtIf t : ifs){
            String condition = t.getCondition().toString();
            if(condition.equals("true")){
                elements.add(new elementSchema(
                        logMessage,
                        t.getPosition().getFile().getName(),
                        t.getPosition().getLine(),
                        t.getPosition().getEndLine(),
                        t.toString()
                ));
            }
        }
    }
}
