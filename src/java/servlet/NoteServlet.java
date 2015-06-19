/*
 * Copyright 2015 Len Payne <len.payne@lambtoncollege.ca>.
 * Updated 2015 Mark Russell <mark.russell@lambtoncollege.ca>s
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
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Note;

/**
 * Provides an Account Balance and Basic Withdrawal/Deposit Operations
 */
@WebServlet("/note")
public class NoteServlet extends HttpServlet {

    Note note = new Note();

    /**
     *
     * @param request
     * @param response
     * @throws java.io.IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter write = response.getWriter();
        String mynote = note.getNote();
        write.println(mynote);

    }

    /**
     *
     * @param request
     * @param response
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // PrintWriter write=response.getWriter();
        String setting = "";
        String adding = "";
        String clearing = "";
        setting = request.getParameter("setNote");
        adding = request.getParameter("addNote");
        clearing = request.getParameter("clear");
        if (setting != null) {
            note.setNote(setting);
        } else if (adding != null) {
            note.addNote(adding);
        } else if (clearing != null) {
            note.clear();
        }

    }
}
