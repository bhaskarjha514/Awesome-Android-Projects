# Awesome-Android-Projects
Made these projects, Android is Awesome

About Volley - 
its a library which help us to fetch data from server using Gson,retrofit.
 But we will use Gson here.. 
 so we need to convert  our json data to java class to show in view so we used online to for this, [http://www.jsonschema2pojo.org/]
 
About SimpleGlide ::- most of time we use drawable folder to fetch image and use easily in our xml, But in some scenario we have url of             image and we have to retrieve our image using url and have to show in our activity so we will {{glide}} for it..
          obviously we must have to add in dependency for glide..
     
     code:    ImageView img1 = (ImageView) findViewById(R.id.img1);
              ImageView img2 = (ImageView) findViewById(R.id.img2);

              String[] urls = {
                                 "https://picsum.photos/200/300",
                                 "https://picsum.photos/200"};
                                 
              Glide.with(this).load(urls[0]).into(img1);
              Glide.with(this).load(urls[1]).into(img2);
