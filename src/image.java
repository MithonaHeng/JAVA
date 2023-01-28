// Error
// import java.applet.*;
// import java.awt.*;
// import java.awt.image.*;
// class Grayscale extends RGBImageFilter implements PlugInFilter{
// public Image filter(Applet a,Image in){
//  return a.createImage(new FilterImageSource(in.getSource(),this));
// }
// public filterRGB(int x,int y,int rgb){
//  int r=(rgb>>16)&0xff;
//  int g=(rgb>>8)&0xff;
//  int b=rgb&0xff;
//  int k=(int)(.56*g+.33*r+.11+b);
//  return (0xff000000 | k<<16 | k<<8 | k);
// }
// }
// try {
//  t.waitForID(0);
// iw=img.getWidth(null);
// ih=img.getHeight(null);
// pixels=new int[iw*ih];
// PixelGrabber pg=new PixelGrabber(img,0,0,iw,ih,pixels,0,iw);
// pg.grabPixels();
//  catch (InterruptedException e) {};
// for( int i=0;i<iw*ih;i++){
//  int p=pixels[i];
//  int r=0xff & (p>>16);
//  int g=0xff & (p>>8);
//  int b=0xff&(p);
//  int y=(int)(.33*r +.56*g +.11*b);
//  hist[y]++;

// }
// for(int i=0;i<256;i++){
//  if(hist[i]>max_hist)
//   max_hist=hist[i];
//  }
// }
// public void update(){};
// public void paint(Graphics g){
//  g.drawImage(img,0,0,null);
//  int x=(w-256)/2;
//  int lasty=h-h*hist[0]/max_hist;
//  for(int i=0;i<256;i++;x++){
//   int y=h-h*hist[0]/max_hist;
//   g.setColor(new Color(i,i,i));
//   g.fillRect(x, y, 1 , h);
//   g.setColor(Color.red);
//   g.drawLine(x-1, lasty, x, y);
//   lasty=y;
//  }
// }