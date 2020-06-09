package test01;

/**
 * @author Laevatein
 */
public class TV {
    private int channel, volumLevel;
    private boolean on;
    private final int CHANNEL_MAX = 120, CHANNEL_MIN = 1, VOLUM_MAX = 7, VOLUM_MIN = 1;

    /**
     * 构造默认的TV对象
     */
    public TV() {
        this.channel = 1;
        this.volumLevel = 1;
        this.on = false;
    }

    /**
     * 设置开关为开
     */
    public void turnOn(){
        this.on = true;
    }

    /**
     * 设置开关为关
     */
    public void turnOff(){
        this.on = false;
    }

    /**
     * 设置新的频道
     * @param newChannel 要设置的频道
     */
    public void setChannel(int newChannel) {
        if (!on) {
            System.out.println("电视未开机，调整失败！");
        } else if (newChannel < CHANNEL_MIN || newChannel > CHANNEL_MAX) {
            System.out.println("超出范围，调整失败！");
        } else {
            this.channel = newChannel;
        }
    }

    /**
     * 获取当前频道
     * @return 频道
     */
    public int getChannel() {
        return channel;
    }

    /**
     * 重新设置音量
     * @param newVolum 要设置的音量
     */
    public void setVolum(int newVolum) {
        if (!on) {
            System.out.println("电视未开机，调整失败！");
        } else if (newVolum < VOLUM_MIN || newVolum > VOLUM_MAX) {
            System.out.println("超出范围，调整失败！");
        } else {
            this.volumLevel = newVolum;
        }
    }

    /**
     * 获取当前音量
     * @return 音量
     */
    public int getVolum() {
        return volumLevel;
    }

    /**
     * 使频道递增
     */
    public void channelUp() {
        setChannel(channel + 1);
    }

    /**
     * 使频道递减
     */
    public void channelDown() {
        setChannel(channel - 1);
    }

    /**
     * 使音量递增
     */
    public void volumUp() {
        setVolum(volumLevel + 1);
    }

    /**
     * 使音量递减
     */
    public void volumDown() {
        setVolum(volumLevel - 1);
    }
}