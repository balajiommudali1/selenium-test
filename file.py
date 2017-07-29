from pyvirtualdisplay import Display
from selenium import webdriver
import unittest
display = Display(visible=0, size=(800, 600))
display.start()

class TestUbuntuHomepage(unittest.TestCase):
    
    def setUp(self):
        self.browser = webdriver.Firefox()
        
    def testTitle(self):
        self.browser.get('http://www.ubuntu.com/')
        self.assertIn('Ubuntu', self.browser.title)
        
    def tearDown(self):
        self.browser.quit()


if __name__ == '__main__':
    unittest.main(verbosity=2)

browser.close()
