package pages

import geb.Page

class BookListPage extends Page {
    static url = "http://localhost:8080/books"

    static at = {
        assert title == "Book List"
        assert $("h1", text: "Book List").size() > 0
        assert $("a", text: "sign out").size() > 0
        return true
    }
}
