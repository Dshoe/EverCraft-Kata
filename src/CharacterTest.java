import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    @Test
    public void characterNameTest() {
        Character character = new Character();
        String characterName = "Dan the Dood";

        character.setName(characterName);
        assertNotNull(character);

        assertNotNull(character.getName());
        assertEquals(character.getName(), characterName);
    }

}