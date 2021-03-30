import scrapy

class TapologySpider(scrapy.Spider):
    name = "roster"

    def start_requests(self):
        urls = [
            'https://www.tapology.com/gyms/611-elevation-fight-team'
        ]

        for url in urls:
            yield scrapy.Request(url=url, callback=self.parse)
    
    def parse(self, response):
        page = response.url.split("/")[-2]
        filename = f'roster-{page}.html'
        with open(filename, 'wb') as f:
            f.write(response.body)
        self.log(f'saved file {filename}')