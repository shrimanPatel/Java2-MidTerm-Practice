/*
 * Copyright 2015 Len Payne <len.payne@lambtoncollege.ca>.
 * Updated 2015 Mark Russell <mark.russell@lambtoncollege.ca>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for the Note class
 */
public class NoteTest {
    
    public NoteTest() {
    }

    @Test
    public void testGetNoteIsEmptyOnNewNote() {
        Note instance = new Note();
        String expResult = "";
        String result = instance.getNote();
        assertEquals(expResult, result, "");
    }

    @Test
    public void testGetNoteIssomegibberishAfterSetsomegibberish() {
        String words = "somegibberish";
        Note instance = new Note();
        instance.setNote(words);
        String expResult = "somegibberish";
        String result = instance.getNote();
        assertEquals(expResult, result, "somegibberish");
    }

    @Test
    public void testGetNoteIsExactlyAfterSetNoteExactThenAddNoteLy() {
        Note note=new Note();
       String expres="Exactly";
       note.setNote("Exact");
       note.addNote("ly");
       String result=note.getNote();
       assertEquals(expres, result);
    }
    
    @Test
    public void testGetNoteIsEmptyAfterSetNoteThenClear() {
         Note note=new Note();
         String exp="";
         note.setNote("somegibrish");
         note.clear();
         String res=note.getNote();
         assertEquals(exp, res);
               
    }
}
