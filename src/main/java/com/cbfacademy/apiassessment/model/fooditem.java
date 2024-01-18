    package com.cbfacademy.apiassessment.model;
    
    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;
    import javax.persistence.Column;

  
    
    @Entity
    public class FoodItem {
    
        @Id 
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;  //Unique identifier for each food item (check if private is needed?) 
        
        @Column(name = "food_name", nullable = false, length = 100)
        private String name;  //Name of the food item
    
        private String servingSize; //Describes the serving size of the food (e.g.,"100g","1 cup")
    
        private Integer caloriesPerServing;   // Number of calories per serving (e.g. 100, 1000)
           //If we got extra time more attributes like price, category will be added 
           
        public FoodItem() {
            //No argument constructor
        }
           // Constructor with all the attributes
        public FoodItem(Long id, String name, String servingSize, Integer caloriesPerServing) {
            this.id = id;
            this.name = name;
            this.servingSize = servingSize;
            this.caloriesPerServing = caloriesPerServing;
        }
    
        // Getters and setters for all attributes
    
        @Override
        public String toString() {
            return "FoodItem{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", servingSize='" + servingSize + '\'' +
                    ", caloriesPerServing=" + caloriesPerServing +
                    '}';
        }
    
    }
    //Getters and setters for all attributes

    @Override
    public String toString() {
        String servingSize;
        String caloriesPerServing;
        String id;
        String name;
        return "FoodItem{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", servingSize='" + servingSize + '\'' +
               ", caloriesPerServing=" + caloriesPerServing +
               '}';

    }

}  
