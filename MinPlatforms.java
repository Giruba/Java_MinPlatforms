import java.util.*;
public class MinPlatforms{

     public static void main(String []args){
        System.out.println("MinPlatforms in a railway station - Map based approach");
        
        //Mergesort based merge approach is O(nLogn) Space:O(1)
        int arrivals[] = { 90, 84, 95, 110, 150, 180 };
        int departures[] = { 91, 120, 112, 113, 190, 200 };

        //This map based approach has Space:O(n)
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        for(int index = 0; index < 6; index++){
            map.put(arrivals[index], "Arrival");
            map.put(departures[index], "Departure");
        }
        
        int result = 1;
        int emp =1;
        
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if(pair.getValue() == "Arrival"){
                emp++;      
            }else{
                emp--;
            }
            if(emp > result)
                result = emp;
        }
        System.out.println("Minimum number of platforms required are "+result);
     }
}
