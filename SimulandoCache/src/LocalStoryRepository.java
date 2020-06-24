import java.util.ArrayList;
import java.util.List;

public class LocalStoryRepository implements StoryRepository{

    @Override
    public void add(Story newStory) {

    }

    @Override
    public ArrayList<Story> lists() {
        ArrayList<Story> stories = new ArrayList<>();
        stories.add(new Story("Harttyn", "1", "https://google.cl"));
        stories.add(new Story("Harttyn", "", "sin info"));
        stories.add(new Story("Harttyn", "", "sin info"));
        stories.add(new Story("Harttyn", "", "sin info"));

        return stories;
    }
}
