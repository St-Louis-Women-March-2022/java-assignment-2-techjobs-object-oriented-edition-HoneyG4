package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField
{

   public PositionType(String value) {
      super(value);
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getValue() != null ? getValue().hashCode() : 0);
        return result;
    }


}
