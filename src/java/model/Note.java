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

/**
 * Stores a note and provides some basic methods to manipulate the note
 */
@javax.faces.bean.ApplicationScoped
public class Note {

    String note = "";

    /**
     * Returns the current note
     *
     * @return - the note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * Adds text to the note
     *
     * @param words - the text to add
     */
    public void setNote(String words) {
        this.note = words;
    }

    /**
     * Removes text from the note
     *
     * @param words - the text to remove
     */
    public void addNote(String words) {
        this.note = this.note.concat(words);
    }

    /**
     * Removes all text from the note
     */
    public void clear() {
        this.note = "";
    }
}
