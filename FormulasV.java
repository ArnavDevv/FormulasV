package io.arnav.FormulasV;

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;
import java.lang.Math;

@DesignerComponent(
        version = 1,
        description = "Complex formulas made easy. Developed by ArnaV Bhardwaj",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "https://arnavdevv.github.io/ArnavDev/assets/favicon.png")

@SimpleObject(external = true)
//Libraries
@UsesLibraries(libraries = "")
//Permissions
@UsesPermissions(permissionNames = "")

public class FormulasV extends AndroidNonvisibleComponent {

    //Activity and Context
    private Context context;
    private Activity activity;

    public FormulasV(ComponentContainer container){
        super(container.$form());
        this.activity = container.$context();
        this.context = container.$context();
    }

    @SimpleFunction(description = "Check if number is prime")
    public boolean IsPrime(int num){
         boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
     return flag;
    else
      return !flag;
  }

  @SimpleFunction(description = "Get the square root of any number")
      public double GetSquareRoot(int num){
        return Math.sqrt(num); 
      }

      @SimpleFunction(description = "Get the cube root of any number")
      public double GetCubeRoot(int num){
        return Math.cbrt(num); 
      }

      @SimpleFunction(description = "Calculate exponents")
      public double CalcExponent(double base, double power){
        return Math.pow(base,power); 
      }
  
    @SimpleFunction(description = "Find hypotenuse")
    public double FindHypotenuse(double perpendicular, double base) {
        return Math.hypot(perpendicular, base);
    }
      @SimpleFunction(description = "Calculate the hyperbolic sine of a value.")
public double CalculateSinh(double num){
    return Math.sinh(num);
}

@SimpleFunction(description = "Calculate the hyperbolic cosine of a value.")
public double CalculateCosh(double num){
    return Math.cosh(num);
}

@SimpleFunction(description = "Calculate the hyperbolic tangent of a value.")
public double CalculateTanh(double num){
    return Math.tanh(num);
}

@SimpleFunction(description = "Find if the number is perfect or not.")
public boolean IsPerfect(int num){
            int sum = 0;
            for(int i = 1; i < num; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == num)
        {
            return true;
        }
        else
        {
            return false;
        }    
    }

    @SimpleFunction(description = "Find if the number is an Armstrong number")
    public boolean IsArmstrong(int num){
        int b = 0;
        double sum = 0;
        int count = 0;
        int a = num;
        int c = num;
        while(a > 0)
        {
            a = a / 10;
            count++;
        }
        while(num > 0)
        {
            b = num % 10;
            sum = (sum+Math.pow(b, count));
            num = num / 10;
        }
        if(sum == c)
        {
           return true;
        }
        else
        {
            return false;
        }
    }

}






