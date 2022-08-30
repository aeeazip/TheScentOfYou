package com.scentofyou.scentofyou.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestController {
	@GetMapping("/scentofyou/testStart.do")
	public String start() {
		return "thymeleaf/testPages/TestStart";
	}
	
	@GetMapping("/scentofyou/testResult.do")
	public String result() {
		return "thymeleaf/testPages/TestResult";
	}
	
	@GetMapping("/scentofyou/tpage0.do")
	public String move0() {
		return "thymeleaf/testPages/Tpage0";
	}
	
	@GetMapping("/scentofyou/tpage1.do")
	public String move1() {
		return "thymeleaf/testPages/Tpage1";
	}
	
	@GetMapping("/scentofyou/tpage2.do")
	public String move2() {
		return "thymeleaf/testPages/Tpage2";
	}
	
	@GetMapping("/scentofyou/tpage2aro.do")
	public String move2ARO() {
		return "thymeleaf/testPages/Tpage2aro";
	}
	
	@GetMapping("/scentofyou/tpage2chy.do")
	public String move2CHY() {
		return "thymeleaf/testPages/Tpage2chy";
	}
	
	@GetMapping("/scentofyou/tpage2cit.do")
	public String move2CIT() {
		return "thymeleaf/testPages/Tpage2cit";
	}
	
	@GetMapping("/scentofyou/tpage2flo.do")
	public String move2FLO() {
		return "thymeleaf/testPages/Tpage2flo";
	}
	
	@GetMapping("/scentofyou/tpage2ori.do")
	public String move2ORI() {
		return "thymeleaf/testPages/Tpage2ori";
	}
	
	@GetMapping("/scentofyou/tpage2lea.do")
	public String move2LEA() {
		return "thymeleaf/testPages/Tpage2lea";
	}
	
	@GetMapping("/scentofyou/tpage2woo.do")
	public String move2WOO() {
		return "thymeleaf/testPages/Tpage2woo";
	}
	
	@GetMapping("/scentofyou/tpage3.do")
	   public String move3() {
	      return "thymeleaf/testPages/Tpage3";
	   }

	@GetMapping("/scentofyou/tpage3.ori.do")
	   public String move3ori() {
	      return "thymeleaf/testPages/Tpage3.ori";
	   }

	@GetMapping("/scentofyou/tpage3aro.do")
	   public String move3aro() {
	      return "thymeleaf/testPages/Tpage3aro";
	   }

	@GetMapping("/scentofyou/tpage3chy.do")
	   public String move3chy() {
	      return "thymeleaf/testPages/Tpage3chy";
	   }

	@GetMapping("/scentofyou/tpage3cit.do")
	   public String move3cit() {
	      return "thymeleaf/testPages/Tpage3cit";
	   }

	@GetMapping("/scentofyou/tpage3flo.do")
	   public String move3flo() {
	      return "thymeleaf/testPages/Tpage3flo";
	   }

	@GetMapping("/scentofyou/tpage3lea.do")
	public String move3LEA() {
		return "thymeleaf/testPages/Tpage3lea";
	}

	@GetMapping("/scentofyou/tpage3woo.do")
	   public String move3woo() {
	      return "thymeleaf/testPages/Tpage3woo";
	   }
	
	@GetMapping("/scentofyou/tpage4.do")
	   public String move4() {
	      return "thymeleaf/testPages/Tpage4";
	   }


	@GetMapping("/scentofyou/tpage5.do")
	   public String move5() {
	      return "thymeleaf/testPages/Tpage5";
	   }

	@GetMapping("/scentofyou/tpage6.do")
	   public String move6() {
	      return "thymeleaf/testPages/Tpage6";
	   }
}
