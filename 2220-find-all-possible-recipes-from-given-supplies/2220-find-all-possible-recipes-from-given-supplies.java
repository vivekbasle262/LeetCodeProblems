import java.util.*;

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> ans = new ArrayList<>();
        Set<String> supply = new HashSet<>();
        
        // Add initial supplies to the set
        for (String item : supplies) {
            supply.add(item);
        }

        boolean changed = true; // Flag to track if there is a change in supply
        while (changed) {
            changed = false; // Reset change flag
            for (int i = 0; i < recipes.length; i++) {
                // If the recipe is not already in the answer list
                if (!ans.contains(recipes[i])) {
                    boolean canMake = true;
                    // Check if all ingredients are in the supply
                    for (String ingredient : ingredients.get(i)) {
                        if (!supply.contains(ingredient)) {
                            canMake = false;
                            break;
                        }
                    }

                    // If all ingredients are in the supply, add the recipe to the answer and supply
                    if (canMake) {
                        supply.add(recipes[i]);  // Add the recipe to supply (so it can be used for future recipes)
                        ans.add(recipes[i]);
                        changed = true; // Mark that we've updated the supply
                    }
                }
            }
        }

        return ans;
    }
}
