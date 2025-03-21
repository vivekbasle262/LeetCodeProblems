import java.util.*;

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> ans = new ArrayList<>();
        Set<String> supply = new HashSet<>();
        
    
        for (String item : supplies) {
            supply.add(item);
        }

        boolean changed = true; 
        while (changed) {
            changed = false; 
            for (int i = 0; i < recipes.length; i++) {
          
                if (!ans.contains(recipes[i])) {
                    boolean canMake = true;
                   
                    for (String ingredient : ingredients.get(i)) {
                        if (!supply.contains(ingredient)) {
                            canMake = false;
                            break;
                        }
                    }

                   
                    if (canMake) {
                        supply.add(recipes[i]);  
                        ans.add(recipes[i]);
                        changed = true; 
                    }
                }
            }
        }

        return ans;
    }
}
