package saleh_case_study;


    /**
     * Car Radio implementation
     *
     * TODO limit frequency for each band
     * TODO add constructor (initial state)
     */
    public class Radio {
        private final Integer MAX_CHANNELS = 6;

        Channel channels[];
        Integer currentFrequency;
        Integer currentVolume;
        Band currentBand;

        final Integer MIN_FR_FM1 = 88 ;
        final Integer MAX_FR_FM1 = 108 ;
        final Integer MIN_FR_AM = 55;
        final Integer MAX_FR_AM = 172;



        public Radio(Channel channels[], Integer currentFrequency, Integer currentVolume, Band currentBand ){

            this.channels = channels;
            if(currentBand == Band.FM1 | currentBand == Band.FM2) {
                while (currentFrequency > MIN_FR_FM1 || currentFrequency < MAX_FR_FM1) {
                    this.currentFrequency = currentFrequency;
                }
            }else if (currentBand == Band.AM){
                while (currentFrequency > MIN_FR_AM || currentFrequency < MAX_FR_AM){
                    this.currentFrequency = currentFrequency;
                }
            }

            this.currentVolume = currentVolume;
            this.currentBand = currentBand;


        }



        // getter method
    //    public Integer getCurrentFrequency() {
    //        return currentFrequency;
    //    }

        // setter method
    //    public void setCurrentFrequency(Integer currentFrequency) {
    //        this.currentFrequency = currentFrequency;
    //    }

        // getter method
    //    public Integer getCurrentVolume() {
    //        return currentVolume;
    //    }

        // setter method
    //    public void setCurrentVolume(Integer currentVolume) {
    //        this.currentVolume = currentVolume;
    //    }
        

        public void volumeUp() {
            currentVolume++;
        }
        public void volumeDown() {
            currentVolume--;
        }

        public void tuneUp() {
            currentFrequency++;
        }
        public void tuneDown() {
            currentFrequency--;
        }

        public void switchBand(Band band) {
            currentBand = band;
        }



        /**
         * Finds next tune
         * Seek left off due to complexity
         *
         */
        public void seekUp() {

        //    Band b1 = Band.FM1;
        //    Band b2 = Band.FM2;
        //    Band b3 = Band.AM;

          //  if(Band b1)
            //    for (int frequency , 88 < frequency < 108;  frequency++;)
              //      currentFrequency = getCurrentFrequency();

        //    switch(Band){
        //        case FM1: {
        //            88 < currentFrequency < 108;
        //            currentFrequency++;
        //            break;
        //        }
        //        case FM2: {
        //            88 < currentFrequency < 108;
        //            currentFrequency++;
        //            break;
        //        }
        //        case AM: {
        //            55 < currentFrequency < 172;
        //            currentFrequency++;
        //            break;
        //        }


            if(currentBand == Band.FM1 | currentBand == Band.FM2) {
                while (currentFrequency>MIN_FR_FM1 || currentFrequency < MAX_FR_FM1) {
                    currentFrequency++;
                }


                }else if(currentBand == Band.AM){
                while (currentFrequency> MIN_FR_AM || currentFrequency < MAX_FR_AM){
                    currentFrequency++;
                }
            }

            }


        public void seekDown() {

        //    switch(Band){
        //        case FM1: {
        //            88 < currentFrequency < 108;
        //            currentFrequency--;
        //            break;
        //        }
        //        case FM2: {
        //            88 < currentFrequency < 108;
        //            currentFrequency--;
        //            break;
        //        }
        //        case AM: {
        //            55 < currentFrequency < 172;
        //            currentFrequency--;
        //            break;
        //        }

         //   }

            if(currentBand == Band.FM1 | currentBand == Band.FM2) {
                while (currentFrequency>MIN_FR_FM1 || currentFrequency < MAX_FR_FM1) {
                    currentFrequency--;
                }


            }else if(currentBand == Band.AM){
                while (currentFrequency> MIN_FR_AM || currentFrequency < MAX_FR_AM){
                    currentFrequency--;
                }
            }

        }

        public void saveChannel(Integer position) {
            if (position < MAX_CHANNELS ) {
                Channel channel = new Channel(Band.FM1 , 88); //??????
                channel.band = currentBand;
                channel.getFrequency();
                channels[position] = channel;
            }
        }


    }



