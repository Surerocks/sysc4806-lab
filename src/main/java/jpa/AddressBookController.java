package jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by craigshorrocks on 2/2/2017.
 */
@Controller
public class AddressBookController {

    private AddressBookRepository repo;

    @Autowired
    public void setRepo(AddressBookRepository repo){
        this.repo = repo;
    }

    @RequestMapping(value="/addressbook", method= RequestMethod.PUT)
    public String createAddressBook(Model model){
        AddressBook b = new AddressBook();
        model.addAttribute("book",b);
        repo.save(b);
        return "book";
    }

    @RequestMapping(value="/addressbook/buddies",method=RequestMethod.PUT)
    public String addBuddy(@RequestParam(value="name") String name,
                           @RequestParam(value="phoneNumber") String phoneNumber,
                           Model model){
        AddressBook book = repo.findAll().iterator().next();
        BuddyInfo buddy = new BuddyInfo(name,phoneNumber);
        buddy.setAddress("123 street");
        book.addBuddy(buddy);
        model.addAttribute("book",book);
        repo.save(book);
        return "book";
    }

    @RequestMapping(value="/addressbook/buddies",method=RequestMethod.DELETE)
    public String removeBuddy(@RequestParam(value="name") String name,
                              @RequestParam(value="phoneNumber") String phoneNumber,
                              Model model){
        AddressBook book = repo.findAll().iterator().next();
        BuddyInfo b = new BuddyInfo(name, phoneNumber);
        book.removeBuddy(b);
        model.addAttribute("book",book);
        repo.save(book);
        return "book";
    }
}
