package structural.composite;

import structural.composite.validators.Validator;

public class ValidatorComposite {


    public void validate(Validator validator){
        if(validator.getNodes() != null)
           for(Validator child: validator.getNodes())
               validate(child);

        validator.validate();
    }

}
