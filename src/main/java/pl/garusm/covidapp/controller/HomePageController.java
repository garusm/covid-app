package pl.garusm.covidapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.garusm.covidapp.model.LocationStats;
import pl.garusm.covidapp.service.CoronaVirusDataService;

import java.util.List;

@Controller
public class HomePageController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        long totalReportedCases = allStats.stream().mapToLong(s -> s.getLatestTotalCases()).sum();
        long totalNewCases = allStats.stream().mapToLong(s -> s.getDiffFromPreviousDay()).sum();

        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", totalReportedCases);
        model.addAttribute("totalNewCases", totalNewCases);

        return "home";
    }
}
