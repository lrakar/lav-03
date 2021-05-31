// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
import java.util.ArrayList;

public class ArduinoPrimer
{
    public static void main(String[] args) {
        var modules = new ArduinoBase[5];
        
        var wm = new WifiModule();
        var mm = new MidiModule();
        var cm = new CustomModule();

        modules[0] = wm;        
        modules[1] = mm;        
        modules[2] = cm;        
        
        p(wm.WhatDoIDo());
        p(mm.WhatDoIDo());
        p(cm.WhatDoIDo());
        
        for(int i=0; i<3; i++){
            var pin = modules[i].Pin();
            p(pin);
        }
        
    }
    
    public static void p(String m){
        System.out.println(m);
    }
    
    public static void p(int m){
        System.out.println(m);
    }
}

interface IModule{
    public int Pin();
}

abstract class ArduinoBase {
    private String MacAddresss;
    private String MachineAddress;
    
    public String WhatDoIDo(){
        return "I am arduino base";
    }
    
    public abstract int Pin();
}

class WifiModule extends ArduinoBase {
    public int Pin(){
        return 1;
    }
    
    public String WhatDoIDo(){
        var b = super.WhatDoIDo();
        return b + " with a wifi module";
    }
}

class MidiModule extends ArduinoBase  {
    public int Pin(){
        return 2;
    }
    
    public String WhatDoIDo(){
        var b = super.WhatDoIDo();
        return b + " with midi module";
    }
    
    public void MidiModuleMethod(){}
}

class CustomModule extends ArduinoBase  {
    public int Pin(){
        return 3;
    }
    public String WhatDoIDo(){
        var b = super.WhatDoIDo();
        return b + " with custom module";
    }
    
    public void CustomMethod(){}
}









