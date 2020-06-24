import java.util.ArrayList;
import java.util.List;

public class ApiStoryRepository implements StoryRepository {

    @Override
    public void add(Story newStory) {

    }

    @Override
    public ArrayList<Story> lists() {
        ArrayList<Story> stories = new ArrayList<>();
        stories.add(new Story("Harttyn", "1", "https://google.cl"));
        stories.add(new Story("Harttyn", "2", "https://google.cl"));
        stories.add(new Story("Harttyn", "3", "https://google.cl"));
        stories.add(new Story("Harttyn", "4", "https://google.cl"));
        return stories;
    }
}
