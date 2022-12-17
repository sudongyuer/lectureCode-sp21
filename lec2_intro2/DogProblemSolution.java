package lec2_intro2;

public class DogProblemSolution {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{
                new Dog(10),
                new Dog(15),
                new Dog(20),
                new Dog(15),
                new Dog(10),
                new Dog(5),
                new Dog(10),
                new Dog(15),
                new Dog(22),
                new Dog(15),
                new Dog(20)
        };
        Dog[] returnDogs = findDogLargerThanFourNeighbors(dogs);
        for (int i = 0; i < returnDogs.length; i++) {
            System.out.println(returnDogs[i].weightInPounds);
        }
    }

    private static Dog[] findDogLargerThanFourNeighbors(Dog[] dogs) {
        Dog[] returnDogs = new Dog[dogs.length];
        int count = 0;
        for (int i = 0; i < dogs.length; i++) {
            if (isLargerThanFourNeighbors(i, dogs)) {
                returnDogs[count++] = dogs[i];
            }
        }
        return cleanNullDogs(returnDogs,count);
    }

    private static Dog[] cleanNullDogs(Dog[] returnDogs, int count) {
        Dog[] cleanDogs = new Dog[count];
        for (int i = 0; i < count; i++) {
            cleanDogs[i] = returnDogs[i];
        }
        return cleanDogs;
    }

    private static boolean isLargerThanFourNeighbors(int index, Dog[] dogs) {
        boolean isLarger = true;
        for (int i = -2; i <= 2; i++) {
            // avoid comparing ourself to ourself
            if (i == 0) {
               continue;
            }
            if(isValidIndex(i ,index,dogs)){
                int compareIndex = index + i;
                if(dogs[compareIndex].weightInPounds >= dogs[index].weightInPounds){
                    isLarger = false;
                }
            }
        }
        return isLarger;
    }

    private static boolean isValidIndex(int index, int currentIndex, Dog[] dogs) {
        int compareIndex = index + currentIndex;
        if(compareIndex<0){
            return false;
        }
        if(compareIndex>=dogs.length){
            return false;
        }
        return true;
    }
}
